console.log("adaptative.js");
const texts = document.querySelectorAll(".adaptive-text");
const scores = document.querySelectorAll(".adaptive-score");
let i =0;
texts.forEach(function(text){
   i++;
   let fontsize = 125/text.innerHTML.length;
   fontsize > 20 ? fontsize = 20 : fontsize = fontsize;
   fontsize += "vw";
   console.log(fontsize);
   text.style.fontSize = fontsize;

   // Calculer l'espacement entre les caractères pour occuper toute la largeur en récupérant le width de la div parent
   let parentWidth = text.parentElement.offsetWidth; // Largeur
   console.log("parent width " + i + " " + parentWidth);
   let textWidth = text.scrollWidth; // Largeur du texte
   let numCharacters = text.textContent.length; // Nombre de caractères
   let letterSpacing = (parentWidth - textWidth) / (numCharacters -1);
   letterSpacing < 0 ? letterSpacing = 0 : letterSpacing = letterSpacing;

   // Appliquer l'espacement entre les caractères
   text.style.letterSpacing = letterSpacing + "px";
   // Compenser pour le dernier caractère
   text.style.marginRight = letterSpacing*-1 + "px";
});

scores.forEach(function(score){
   let fontsize = 2/score.innerHTML.length;
   score.style.fontSize = fontsize + "em";
});