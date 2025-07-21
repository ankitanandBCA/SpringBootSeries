async function handleSubmit(event) {
    event.preventDefault();

    const email = document.getElementById("email").value;
    const name = document.getElementById("name").value;
    const password = document.getElementById("password").value;

    const registerData = {email,name, password};



    const baseURL = "http://localhost:8080/add"

    try{
        const response = await fetch(baseURL, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(registerData),
        });

      if(response.ok) {
        alert("Register successfully");

      }
        
    } catch (error) {
        alert("Error is occurring while calling the api")
    }
}