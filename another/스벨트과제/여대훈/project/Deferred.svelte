<script>
import { onMount } from "svelte";

import { crossfade, scale } from "svelte/transition"
import images from "./images.js"


	const [send, receive]=crossfade({
		duration: 200,
		fallback: scale
	});
	 let selected=null
	 let loading=null

	 const ASSETS=`https://sveltejs.github.io/assets/crossfade`

	 const load=image=>{
		const timeout=setTimeout(()=>loading=image,100)

		const img=new Image()

		img.onload=()=>{
			selected=image
			clearTimeout(timeout)
			loading=null
		}
		img.src=`${ASSETS}/${image.id}.jpg`
	 }

	 let characters=["🍕"]

	 let confetti=new Array(100).fill().map((_,i)=>{
		return{
			character: characters[i % characters.length],
			x: Math.random() * 100,
			y: -20 - Math.random() * 100,
			r: 0.1 + Math.random() * 1
		}
	 }).sort((a,b)=>a.r - b.r)
	
	onMount(()=>{
		let frame

		function loop(){
			frame=requestAnimationFrame(loop)

			confetti=confetti.map(emoji=>{
				emoji.y+=0.7*emoji.r
				if(emoji.y>120) emoji.y=-20;
				return emoji;
			})
		}
		loop()
		return()=>cancelAnimationFrame(frame)
	})
</script>

<div class="container">
	<div class="phone">
		<h1>Photo gallery</h1>
		<div class="grid">
			{#each images as image}
				<div class="square">
					{#if selected !== image}
						<button
							style="background-color: {image.color}"
							on:click="{()=>load(image)}"
							in:receive={{key:image.id}}
							out:send={{key:image.id}}
							>{loading===image ? '...' : image.id}
						</button>
					{/if}
				</div>				
			{/each}
		</div>

		{#if selected}
			{#await selected then d}
			<div class="photo" in:receive={{key:d.id}} out:send={{key:d.id}}>
				<img
				alt={d.alt}
				src="{ASSETS}/{d.id}.jpg"
				on:click="{()=>selected=null}">

				<p class="credit">
					<a target="_blank"
					href="https://www.flickr.com/photos/{d.path}">via Flickr</a>&ndash
					<a target="_blank" href="{d.license.url}">{d.license.name}</a>
				</p>
			</div>
				
			{/await}
			
		{/if}
	</div>
</div>

{#each confetti as c}
	<span style="left: {c.x}%; top: {c.y}%; transform: scale({c.r})">{c.character}</span>
{/each}
<style>
	
	.container {
		position: absolute;
		display: flex;
		align-items: center;
		justify-content: center;
		width: 100%;
		height: 100%;
		top: 0;
		left: 0;
	}

	.phone {
		position: relative;
		display: flex;
		flex-direction: column;
		width: 52vmin;
		height: 76vmin;
		border: 2vmin solid #ccc;
		border-bottom-width: 10vmin;
		padding: 3vmin;
		border-radius: 2vmin;
	}

	h1 {
		font-weight: 300;
		text-transform: uppercase;
		font-size: 5vmin;
		margin: 0.2em 0 0.5em 0;
	}

	.grid {
		display: grid;
		flex: 1;
		grid-template-columns: repeat(3, 1fr);
		grid-template-rows: repeat(4, 1fr);
		grid-gap: 2vmin;
	}

	button {
		width: 100%;
		height: 100%;
		color: white;
		font-size: 5vmin;
		border: none;
		margin: 0;
		will-change: transform;
	}

	.photo, img {
		position: absolute;
		top: 0;
		left: 0;
		width: 100%;
		height: 100%;
		overflow: hidden;
	}

	.photo {
		display: flex;
		align-items: stretch;
		justify-content: flex-end;
		flex-direction: column;
		will-change: transform;
	}

	img {
		object-fit: cover;
		cursor: pointer;
	}

	.credit {
		text-align: right;
		font-size: 2.5vmin;
		padding: 1em;
		margin: 0;
		color: white;
		font-weight: bold;
		opacity: 0.6;
		background: rgba(0,0,0,0.4);
	}

	.credit a, .credit a:visited {
		color: white;
	}

	:global(body) {
		overflow: hidden;
	}

	span {
		position: absolute;
		font-size: 5vw;
		user-select: none;
	}

</style>