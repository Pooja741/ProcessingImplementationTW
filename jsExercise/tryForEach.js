function myForEach(arr, myfunc){
    for(let i = 0; i < arr.length; i++){
        myfunc(arr[i]);
    }
}

function upperCase(word){
    console.log(word.toUpperCase());
}

let words = ["This", "is", "for", "each", "function"];
myForEach(words, upperCase);
