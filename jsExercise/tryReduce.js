function myReducer(nums, myfunc, accumulator){
    for(let i = 0; i < nums.length; i++){
        accumulator = myfunc(nums[i], accumulator);
    }
    return accumulator;
}

function multiply(number, accumulator){
    return number * accumulator;
}

let nums = [1, 2, 3, 4, 5];
let answer = myReducer(nums, multiply, 1);
console.log(answer);
