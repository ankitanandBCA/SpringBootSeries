 async function uploadData(event) {
    event.preventDefault(); 

   const desc=document.getElementById("description").value;
   const file=document.getElementById("file").files[0];

   const formData=new FormData();
   formData.append("desc",desc);
   formData.append("file",file);

const url="http://localhost:8080/UploadFiles"
try {
      const response=await fetch(url,{
        method:"POST",
        body:formData
      }) ;
      if(response.ok)
      {
        alert("file upload sucessfully")
      }
      else{
        alert("file upload failed")
      }
   
} catch (error) {
    alert(error)
}


}

// view pdf
async function load() {
    try {
        const response = await fetch("http://localhost:8080/View");
        const data = await response.json();

        document.getElementById("fileList").innerHTML = "";

        data.forEach(element => {
            const div = document.createElement("div");
            div.innerHTML = `
               <div class="row mb-3">
                  <div class="col-sm-6">
                    <div class="card shadow-sm">
                      <div class="card-body">
                        <h5 class="card-title">${element.description}</h5>
                        <button class="btn btn-primary btn-sm" onclick="viewPdf(${element.userId})">View PDF</button>
                        <button class="btn btn-danger btn-sm" onclick="deletePdf(${element.userId})">Delete</button>
                      </div>
                    </div>
                  </div>
               </div>
            `;
            document.getElementById("fileList").appendChild(div);
        });
    } catch (error) {
        console.error("Error loading files:", error);
    }
}

// window.onload me function ko call mat karo, assign karo
window.onload = load;


function viewPdf(userId) {

    const pdfUrl = `http://localhost:8080/views/${userId}`;
window.open(pdfUrl, "_blank", "noopener,noreferrer");

}



function deletePdf(userId) {
    const url = `http://localhost:8080/delete/${userId}`;
    fetch(url, {
        method: "DELETE"
    })
        .then(response => {
            if (response.ok) {
                alert("File deleted successfully");
                load();
            } else {
                alert("File deletion failed");
            }
        })
        .catch(error => {
            console.error("Error deleting file:", error);
        });
}