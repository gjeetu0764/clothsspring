let marquee = document.getElementById('welcomemarquee');
let content = document.getElementById('social');
let btn = document.getElementById('social_btn');

// function marqueechange(String message){
//     marquee.innerHTML= message +" WELCOME TO WHOLESALE CLOTHS GALAXY";
// }

function openBtn() {
    document.getElementById("navbarSupportedContent").style.width="200px";  
    
}

function closeBtn() {
    document.getElementById("navbarSupportedContent").style.width="0";
    
}


function show() {
    content.style.display ="block";
    
}

function hide() {
    content.style.display ="none";
    
}
btn.addEventListener('mouseover',show);
btn.addEventListener('click',hide);

