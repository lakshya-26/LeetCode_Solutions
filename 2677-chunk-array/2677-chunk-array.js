/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    const newArr = require("lodash");
    return newArr.chunk(arr,size);
};
