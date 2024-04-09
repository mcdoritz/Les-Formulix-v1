
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
    loginEmailUsername.required = false;
    loginPassword.required = false;
    signupEmail.required = true;
    signupUsername.required = true;
    signupPassword.required = true;
    signupPassword2.required = true;
    signupCheckup.required = true;

}

function showLogin(){
    signupButton.classList.add("hidden");
    loginButton.classList.add("hidden");
    loginForm.classList.remove("hidden");
    signupForm.classList.add("hidden");
    loginBackLink.innerHTML="Signup instead";
    loginEmailUsername.required = true;
    loginPassword.required = true;
    signupEmail.required = false;
    signupUsername.required = false;
    signupPassword.required = false;
    signupPassword2.required = false;
    signupCheckup.required = false;

}

// FORM ------------------------------------------------------------------------
const regexEmail = new RegExp(/^(?=.{1,100}$)\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/);
const regexUsername = new RegExp(/^[a-zA-Z0-9_-]{2,50}$/);
const regexPassword = new RegExp(/^[a-zA-Z0-9!@#$%^&*()-_=+`~]{6,30}$/);
const specialCharsUsername = "-_";
const specialCharsPassword = "!@#$%^&*()-_=+`~";

// 1 : LOGIN
const loginEmailUsername = document.getElementById("login-email");
const loginPassword = document.getElementById("login-password");

loginForm.addEventListener("submit", (event) => {
    // On empêche le comportement par défaut
    event.preventDefault();

    // On récupère les deux champs et on walid

    console.log(loginEmailUsername.value);
    console.log(loginPassword.value);
    console.log(loginPassword.value.length)

    // Login entré : email ou username ?

    if(loginPassword.value.length >= 6){
        if(loginEmailUsername.value.includes("@")){

            if(regexEmail.test(loginEmailUsername.value)){
                console.info("Formulaire avec email, VALIDE");
                event.target.submit();
            }else{
                if(loginEmailUsername.value.length > 100){
                    console.error("Formulaire avec email, INVALIDE : trop long");
                }else{
                    console.error("Formulaire avec email, INVALIDE");
                }

            }

        }else{
            if(loginEmailUsername.value.length >= 2){
                console.info("Formulaire avec username, VALIDE");
                event.target.submit();
            }else{
                console.error("Formulaire avec username, INVALIDE");
            }

        }

    }else{
        console.error("password entré trop court");
    }

});

// 2: SIGNUP
const signupEmail = document.getElementById("signup-email");
const signupUsername = document.getElementById("signup-username");
const signupPassword = document.getElementById("signup-password");
const signupPassword2 = document.getElementById("signup-password2");
const signupCheckup = document.getElementById("signup-checkup");
let error = false;

signupForm.addEventListener("submit", (event) => {
    // On empêche le comportement par défaut
    event.preventDefault();
//Ordre des vérifs : du plus sujet à erreur au moins sujet à erreur
//Vérification si pw est bon
    if (regexPassword.test(signupPassword.value)) {
        //Vérification si pw = pw2
        if (signupPassword.value == signupPassword2.value) {
            //Vérification email
            console.info(signupEmail.value.length);
            if (regexEmail.test(signupEmail.value)) {
                //Vérification username
                if (regexUsername.test(signupUsername.value)) {
                    console.info("Formulaire VALIDE");
                    event.target.submit();
                } else {
                    //Quelle erreur de username ?
                    if (signupUsername.value.length < 2 || signupUsername.value.length > 50) {
                        console.error("Le mot de passe doit être d'au moins 2 caractères et 50 maximum");
                    }else{
                        console.error("Un caractère non-autorisé a été trouvé dans le username.")
                    }
                }

            } else {
                if(signupEmail.value.length > 100){
                    console.error("Formulaire avec email, INVALIDE : email trop long");
                }
                console.error("Formulaire avec email, INVALIDE : erreur avec l'email");
            }
        } else {
            console.error("Les deux mots de passe ne correspondent pas");
        }
    } else {
        //Quelle erreur de mdp ?
        error = false;
        if (signupPassword.value.length < 6 || signupPassword.value.length > 30) {
            console.error("Le mot de passe doit être d'au moins 2 caractères et 30 maximum");
        }else{
            console.error("Un caractère non autorisé a été trouvé dans le mot de passe.");
        }
    }
});