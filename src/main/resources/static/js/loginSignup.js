
// NAVIGATION ------------------------------------------------------------------------

const loginButton = document.getElementById("login-button");
const signupButton = document.getElementById("signup-button");
const landingCard = document.getElementById("landing-card");
const loginSignup = document.getElementById("login-signup");
const loginForm = document.getElementById("login-form");
const signupForm = document.getElementById("signup-form");
const loginBackLink = document.getElementById("login-back-link");
const landingBackLink = document.getElementById("landing-back-link");


loginButton.addEventListener("click", (e) =>{
    showLogin();
    landingCardSize();

}) ;

signupButton.addEventListener("click", (e) =>{
    showSignup();
    landingCardSize();
}) ;

loginBackLink.addEventListener("click", (e) =>{
    if(loginBackLink.innerHTML.includes("Signup")){
        console.log("contient signup");
        showSignup();
    }else{
        console.log("contient PAS signup");
        showLogin();
    }
});

function landingCardSize(){
    if(landingCard.classList.contains("h-1/2")){

        loginSignup.classList.remove("h-128");
        loginSignup.classList.add("h-auto");
        loginSignup.classList.remove("h-full");
        loginSignup.classList.remove("justify-evenly");
        loginSignup.classList.add("justify-start");

        landingCard.classList.remove("h-1/2");
        landingCard.classList.add("h-3/5");

    }
}

function showSignup(){

    signupButton.classList.add("hidden");
    loginButton.classList.add("hidden");
    loginForm.classList.add("hidden");
    signupForm.classList.remove("hidden");
    loginBackLink.innerHTML="Login instead";
    loginEmail.required = false;
    loginPassword.required = false;

}

function showLogin(){
    signupButton.classList.add("hidden");
    loginButton.classList.add("hidden");
    loginForm.classList.remove("hidden");
    signupForm.classList.add("hidden");
    loginBackLink.innerHTML="Signup instead";
    loginEmail.required = true;
    loginPassword.required = true;

}

// FORM ------------------------------------------------------------------------
const loginEmail = document.getElementById("login-email");
const loginPassword = document.getElementById("login-password");

loginForm.addEventListener("submit", (event) => {
    // On empêche le comportement par défaut
    event.preventDefault();

    // On récupère les deux champs et on walid

    console.log(loginEmail.value);
    console.log(loginPassword.value);
    console.log(loginPassword.value.length)

    let regex = new RegExp(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/);
    if(regex.test(loginEmail.value) && loginPassword.value.length > 6){
        console.info("Formulaire walidé");
    }else{
        console.error("Erreur dans les entrées du formulaire");
    }
});