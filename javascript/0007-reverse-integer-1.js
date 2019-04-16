/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let result = 0
    let sign = x < 0 ? -1 : 1
    x = Math.abs(x)
    const threshold = Math.pow(2,31)
    
    while (x > 0) {
        const remains = x % 10
        x = Math.floor(x / 10)
        result = result === 0 ? remains : result * 10 + remains
    }
    
    if (result * sign > threshold - 1 || result * sign < -threshold)
        return 0

    return result * sign
};
