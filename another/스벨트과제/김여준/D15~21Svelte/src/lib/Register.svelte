<script>
  let stringStore;
  let arrStore;
  let parseStore;

  let uid = localStorage.length;

  for (const key in localStorage) {
    if (localStorage.hasOwnProperty(key)) {
      arrStore = localStorage.getItem(key);
      parseStore = JSON.parse(arrStore);
    }
  }

  let rid = "";
  let rpw = "";
  let rnn = "";
  let idTF = "";
  let pwTF = "";
  let nnTF = "";
  let tfID = false;
  let tfPW = false;
  let tfNN = false;

  const reset = () => {
    rid = "";
    rpw = "";
    rnn = "";
  };

  function addInfos() {
    if (tfID && tfNN && tfPW) {
      let addInfo = {
        uid: uid,
        id: rid,
        password: rpw,
        nickname: rnn,
      };

      stringStore = JSON.stringify(addInfo);
      localStorage.setItem(`${uid}`, stringStore);

      alert(addInfo.nickname + " Register DONE");

      reset();
    } else {
      alert("wrong");
    }
  }

  function check(obj) {
    let regExp =
      /[ \{\}\[\]\/?.,;:|\)*~`!^\-_+┼<>@\#$%&\'\"\\\(\=\ㄱ-ㅎㅏ-ㅣ가-힣]/gi;

    if (regExp.test(obj.value)) {
      obj.value = obj.value.substring(0, obj.value.length - 1);
    }
  }

  function vRid() {
    for (const key in localStorage) {
      if (localStorage.hasOwnProperty(key)) {
        arrStore = localStorage.getItem(key);
        parseStore = JSON.parse(arrStore);
      }
      if (parseStore.id == rid) {
        idTF = "can not use";
        tfID = false;
        break;
      } else if (rid.length < 4) {
        idTF = "too short";
        tfID = false;
        break;
      } else {
        idTF = "can use";
        tfID = true;
      }
    }
  }

  function vRpw() {
    for (const key in localStorage) {
      if (localStorage.hasOwnProperty(key)) {
        arrStore = localStorage.getItem(key);
        parseStore = JSON.parse(arrStore);
      }
      if (parseStore.password == rpw) {
        pwTF = "can not use";
        tfPW = false;
        break;
      } else if (rpw.length < 4) {
        pwTF = "too short";
        tfPW = false;
        break;
      } else {
        pwTF = "can use";
        tfPW = true;
      }
    }
  }
  function vRnn() {
    for (const key in localStorage) {
      if (localStorage.hasOwnProperty(key)) {
        arrStore = localStorage.getItem(key);
        parseStore = JSON.parse(arrStore);
      }
      if (parseStore.nickname == rnn) {
        nnTF = "can not use";
        tfNN = false;
        break;
      } else if (rnn.length < 2) {
        nnTF = "too short";
        tfNN = false;
        break;
      } else {
        nnTF = "can use";
        tfNN = true;
      }
    }
  }
  function handleKeydownID(event) {
    if (event.key === "Enter") {
      vRid();
    }
  }
  function handleKeydownPW(event) {
    if (event.key === "Enter") {
      vRpw();
    }
  }
  function handleKeydownNN(event) {
    if (event.key === "Enter") {
      vRnn();
    }
  }
</script>

<div>
  <h2>ID</h2>
  <button class="check" on:click={vRid}>check</button>
  <input
    class="infoinput"
    type="text"
    placeholder="ID"
    bind:value={rid}
    on:keypress={handleKeydownID}
    on:keyup={({ target: value }) => check(value)}
    on:keydown={({ target: value }) => check(value)}
  />
  <p id="id" class="tf">{idTF}</p>

  <h2>PASSWORD</h2>
  <button class="check" on:click={vRpw}>check</button>
  <input
    class="infoinput"
    type="password"
    placeholder="Password"
    bind:value={rpw}
    on:keypress={handleKeydownPW}
    on:keyup={({ target: value }) => check(value)}
    on:keydown={({ target: value }) => check(value)}
  />
  <p id="pw" class="tf">{pwTF}</p>

  <h2>NICKNAME</h2>
  <button class="check" on:click={vRnn}>check</button>
  <input
    class="infoinput"
    type="text"
    placeholder="Nickname"
    bind:value={rnn}
    on:keypress={handleKeydownNN}
  />
  <p id="nn" class="tf">{nnTF}</p>

  <button type="reset" on:click={addInfos}>Legister</button>
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
    width: 50%;
    float: left;
    position: relative;
  }

  button {
    margin: 1em 1em 0 0;
    height: 2.5em;
    width: 5em;
    float: right;
  }

  .check {
    margin: 2.5em 1.2em 0 0;
    padding: 0;
    position: relative;
    width: 3em;
    height: 1.5em;
    float: right;
    background-color: azure;
    border: 2px solid black;
  }

  .tf {
    padding: 0;
    position: absolute;
  }

  #id {
    position: absolute;
    margin: -0.3em 0 0 0;
  }
  #pw {
    position: absolute;
    margin: -0.3em 0 0 0;
  }
  #nn {
    position: absolute;
    margin: -0.3em 0 0 0;
  }
</style>
