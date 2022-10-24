var discount = window.prompt("Amount: ");

var num1 = parseInt(discount);

console.log('Amount: ' + num1 )

var product = num1 * .90;
var product2 = num1 * .80;
var product3 = num1 * .70;
var samevalue = num1;

if (num1 <= 1000) {
    console.log('Discounted Amount: ' + samevalue );
}
else if (num1 < 5000) {
    console.log('Discounted Amount: ' + product );
}
else if (num1 < 10000) {
    console.log('Discounted Amount: ' + product2 );
}
else if (num1 >= 10000) {
    console.log('Discounted Amount: ' + product3 );
}