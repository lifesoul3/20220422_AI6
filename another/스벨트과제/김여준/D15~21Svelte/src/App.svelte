<script>
  import Login from "./lib/Login.svelte";
  import Register from "./lib/Register.svelte";
  import { fade, fly } from "svelte/transition";
  import { onMount } from "svelte";

  let canvas;
  onMount(() => {
    const ctx = canvas.getContext("2d");
    let frame;

    (function loop() {
      frame = requestAnimationFrame(loop);

      const imageData = ctx.getImageData(0, 0, canvas.width, canvas.height);

      for (let p = 0; p < imageData.data.length; p += 4) {
        const i = p / 4;
        const x = i % canvas.width;
        const y = (i / canvas.height) >>> 0;

        const t = window.performance.now();

        const r = 64 + (128 * x) / canvas.width + 64 * Math.sin(t / 1000);
        const g = 64 + (128 * y) / canvas.height + 64 * Math.cos(t / 1400);
        const b = 128;

        imageData.data[p + 0] = r;
        imageData.data[p + 1] = g;
        imageData.data[p + 2] = b;
        imageData.data[p + 3] = 255;
      }

      ctx.putImageData(imageData, 0, 0);
    })();

    return () => {
      cancelAnimationFrame(frame);
    };
  });

  let corrent = "log";

  let stringStore;
  let uid = 0;

  const adminInfos = {
    uid: uid,
    id: "admin",
    password: "1234",
    nickname: "admin",
  };
  stringStore = JSON.stringify(adminInfos);
  localStorage.setItem(`${uid}`, stringStore);
</script>

<span>
  <button
    id="b1"
    class:active={corrent === "log"}
    on:click={() => (corrent = "log")}>Login</button
  >
  <button
    id="b2"
    class:active={corrent === "reg"}
    on:click={() => (corrent = "reg")}>Register</button
  >
</span>
{#if corrent === "log"}
  <main in:fly={{ y: 200, duration: 2000 }} out:fade>
    <h1 class="h1Login">Login</h1>
    <div class="d">
      <Login />
    </div>
  </main>
{:else if corrent === "reg"}
  <main in:fly={{ y: 200, duration: 2000 }} out:fade>
    <h1 class="h1Login">Register</h1>
    <div class="dd">
      <Register />
    </div>
  </main>
{/if}
<canvas bind:this={canvas} width={32} height={32} />

<style>
  :root {
    font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Oxygen,
      Ubuntu, Cantarell, "Open Sans", "Helvetica Neue", sans-serif;
  }

  canvas {
    position: absolute;
    width: 80%;
    height: 80%;
    z-index: 1;
    left: 50%;
    top: 45%;
    transform: translate(-50%, -50%);
    background-color: #666;
    -webkit-mask: url(./lib/Svelte_Logo.svg) 50% 50% no-repeat;
    mask: url(./lib/Svelte_Logo.svg) 50% 50% no-repeat;
    opacity: 0.5;
  }

  main {
    position: absolute;
    left: 50%;
    top: 45%;
    transform: translate(-50%, -50%);
    border: 1px solid black;
    padding: 20px 26px 20px 20px;
    width: 50%;
    height: 70%;
    z-index: 2;
    justify-content: center;
    display: flex;
  }

  h1 {
    font-size: 4em;
  }

  .d {
    position: absolute;
    top: 30%;
    width: 75%;
  }
  .dd {
    position: absolute;
    top: 25%;
    width: 75%;
  }

  .h1Login {
    margin-top: 0;
    padding-top: 0;
    text-align: center;
  }

  .active {
    background-color: #ff3e00;
    color: white;
  }

  span {
    position: absolute;
    left: 23.4%;
    top: 3%;
  }
</style>
