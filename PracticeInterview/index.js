async function userdetails(){

    try{
    const response= await fetch("https://jsonplaceholder.typicode.com/users");
    const user=await response.json();



    user.forEach(use => {
        
    document.getElementsByClassName("user-details")[0].innerHTML+=
    
    `
      <div class="user-card">
      <h2>${use.name}</h2>
      <p>${use.id}</p>
      <h3>${use.email}</h3>
      <h3>${use.address}</h3>
      </div>   
    
    `;
    });

    
}catch(error){
    document.getElementsByClassName("error-handle").innerHTML="Failed To fetch data";
    console.log(error);
}
}

userdetails();