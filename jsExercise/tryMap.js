function myMap(nums, myfunc){
    let result = [];
    for(let i = 0; i < nums.length; i++){
        result.push(myfunc(nums[i]));
    }
    return result;
}

function square(number){
    return number ** 2;
}

let nums = [1, 2, 3, 4, 5];
let square_of_nums = myMap(nums, square);
console.log(square_of_nums);
