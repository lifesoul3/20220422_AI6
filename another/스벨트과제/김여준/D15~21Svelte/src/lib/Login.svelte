<script>
  let id;
  let pw;
  let arrStore;
  let parseStore;

  for (const key in localStorage) {
    if (localStorage.hasOwnProperty(key)) {
      arrStore = localStorage.getItem(key);
      parseStore = JSON.parse(arrStore);
    }
  }

  const reset = () => {
    pw = "";
  };

  function loginTF() {
    for (const key in localStorage) {
      if (localStorage.hasOwnProperty(key)) {
        arrStore = localStorage.getItem(key);
        parseStore = JSON.parse(arrStore);
      }
      if (parseStore.id == id && parseStore.password == pw) {
        alert("logged in");
        break;
      } else if (parseStore.uid == "") {
        alert("wrong");
        break;
      }
    }

    reset();
  }
  function handleKeydown(event) {
    if (event.key === "Enter") {
      loginTF();
    }
  }
</script>

<div>
  <h2>ID</h2>
  <input
    type="text"
    placeholder="ID"
    bind:value={id}
    on:keypress={handleKeydown}
  />
  <h2>PASSWORD</h2>
  <input
    type="password"
    placeholder="Password"
    bind:value={pw}
    on:keypress={handleKeydown}
  />
  <button type="reset" on:click={loginTF}>Login</button>
</div>

<style>
  div {
    text-align: left;
  }

  input {
    width: 97%;
    height: 2em;
    font-size: 1em;
    border: 2px solid gray;
  }

  input:focus {
    border: 2px solid blue;
    outline: none;
  }

  h2 {
    margin-bottom: 2%;
  }

  button {
    margin: 8% 2% 0 0;
    height: 2.5em;
    width: 5em;
    float: right;
  }
</style>
