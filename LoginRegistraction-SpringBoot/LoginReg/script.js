async function handleSubmit(event) {
    event.preventDefault();

    const userId = document.getElementById("userId").value;
    const password = document.getElementById("password").value;

    const loginData = {userId, password};

    console.log("this is your data "+ loginData.userId + "  " + loginData.password);


    const baseURL = "http://localhost:8080/loginUser"

    try{
        const response = await fetch(baseURL, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(loginData),
        });

      const data = await response.json();
      console.log(data);

      if(data) {
        alert("Login successfully");
      }

      else {
        alert("wrong credentials, please try again");
      }
        
    } catch (error) {
        alert("Error is occurring while calling the api")
    }
}