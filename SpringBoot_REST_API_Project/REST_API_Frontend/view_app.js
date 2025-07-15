document.addEventListener("DOMContentLoaded",featchStudent)

async function featchStudent(){


    try{

    const response=await fetch("http://localhost:8080/api/getall")

     if(response.ok){
        const students=await response.json()
        const tbody=document.getElementById("tb");
        tbody.innerHTML='';
        students.forEach(student => {
            const row=document.createElement("tr");
            row.innerHTML=`
            <td>${student.id}</td>
             <td>${student.name}</td>
               <td>${student.dpt}</td> 
                 <td>${student.age}</td>
                 <td><button class="btn btn-danger" onclick="deletest(${student.id}) ">Delete </button>  &nbsp;  <button class="btn btn-primary" onclick="openEditForm(${student.id}, '${student.name}', '${student.dpt}', ${student.age})">Edit</button> </td>
            
            `;
            tbody.appendChild(row)
        });
     }



    }catch(error)
    {
        console.log(error);
        
    }
}

async function deletest(id) {
  // अतिरिक्त space हटायें
  const baseUrl = `http://localhost:8080/api/delete/${id}`;

  try {
    const response = await fetch(baseUrl, {
      method: "DELETE",          // ⇦ सही HTTP मेथड
      headers: {                 // (ज़रूरत न भी हो तो Future‑proof)
        "Content-Type": "application/json"
      }
    });

    if (response.ok) {
      alert("Data deleted successfully");
      featchStudent();           // लिस्ट री‑लोड करें
    } 
  } catch (error) {
    console.error("Network / CORS error:", error);
  }
}



function openEditForm(id,name,dpt,age){
      window.location.href =
    `update.html?id=${encodeURIComponent(id)}&name=${encodeURIComponent(name)}&dpt=${encodeURIComponent(dpt)}&age=${encodeURIComponent(age)}`;
}

document.addEventListener("DOMContentLoaded", ()=>{

    const urlprams= new URLSearchParams(window.location.search);
    document.getElementById("uid").value = urlprams.get('id');
     document.getElementById("uname").value = urlprams.get('name');
      document.getElementById("udept").value = urlprams.get('dpt');
       document.getElementById("uage").value = urlprams.get('age');

})

async function updateStudent() {
  const id  = document.getElementById("uid").value;
  const name = document.getElementById("uname").value;
  const dpt  = document.getElementById("udept").value;
  const age  = document.getElementById("uage").value;

  const updStudent = { id, name, dpt, age };

  try {
    const response = await fetch(`http://localhost:8080/api/update/${id}`, {
      method: "PUT",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(updStudent)
    });

    if (response.ok) {
      alert("Student updated successfully!");
       window.location.href = "viewStudent  .html";
          // ताज़ा लिस्ट
    } 
  } catch (error) {
    console.error("Network / CORS error:", error);
  }
}

