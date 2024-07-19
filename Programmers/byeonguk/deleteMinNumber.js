const solution = (arr) => {
    const filteredArr = arr.filter(value => value !== Math.min(...arr));
    return filteredArr.length === 0 ? [-1] : filteredArr;
}