
let buttons = document.querySelectorAll(".button");

buttons.forEach(function(button){
    button.addEventListener('click', function(event){
        animateButton(event);
    })
})

function animateButton(event){
    let button = event.target;
    button.classList.add('active');
    setTimeout(function(){
        button.classList.remove('active');
    }, 1000);
}