async function handlesubmit(event){
    event.preventDefault();

    const id=document.getElementById("id").value;
    const name=document.getElementById("name").value;
    const dpt=document.getElementById("dept").value;
    const age=document.getElementById("age").value;
    
    const student={id,name,dpt,age};
    console.log(JSON.stringify(student))


    const baseUrl="http://localhost:8080/api/add";

    try{
        const response=await fetch(baseUrl,{
            method:"POST",
            headers:{
                'Content-type':"application/json"
            },
            body:JSON.stringify(student)
        });

        if(response.ok){
            alert("student data save")
        }
        

    }catch(error)
    {
        console.log(error)
    }
}

function clicl()
{
    window.location.href="viewStudent.html"
}