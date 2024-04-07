let loginButton = document.getElementById("login-button");
let signupButton = document.getElementById("signup-button");
let landingCard = document.getElementById("landing-card");
let loginSignup = document.getElementById("login-signup");

loginButton.addEventListener("click", (e) =>{
    loginButton.classList.add("hidden");
    signupButton.classList.remove("hidden");
    landingCardSize();

}) ;

signupButton.addEventListener("click", (e) =>{
    signupButton.classList.add("hidden");
    loginButton.classList.remove("hidden");
    landingCardSize();
}) ;

function landingCardSize(){
    if(landingCard.classList.contains("h-1/2")){
        landingCard.classList.remove("h-1/2");
        landingCard.classList.add("h-full");
        loginSignup.classList.remove("h-128");
        loginSignup.classList.add("h-full");
        loginSignup.classList.remove("justify-evenly");
        loginSignup.classList.add("justify-start");

    }
}