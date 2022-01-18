function myFilter(nums, predicate){
    let result = [];
    for(let i = 0; i < nums.length; i++){
        if(predicate(nums[i]))
            result.push(nums[i]);
    }
    return result;
}

let nums = [1, 2, 3, 4, 5, 6];

function isEven(number){
    return (number % 2) == 0;
}

let evenNums = myFilter(nums, isEven);
console.log(evenNums);