
let buttons = document.querySelectorAll(".button");

buttons.forEach(function(button){
    button.addEventListener('click', function(event){
        animateButton(event);
    })
})

function animateButton(event){
    console.log("button clicked");
    let button = event.target;
    button.classList.add('active');
    button.classList.remove('inactive');

    setTimeout(function(){
        button.classList.add('inactive');
        button.classList.remove('active');
    }, 500);
}