for(var i = 0; i<5; i++){
    console.log(i + '. Berfikir')
}
console.log('\n')

//for/in
var nama = [{fName : 'Muslih' , lName : 'sapii' , age : 19} , {
    fName : 'sujono' , lName : 'dwi' , age : 19}]

for(var x in nama){
    console.log('Nama\t : ')
    console.log(nama[x].fName)
    console.log(nama[x].IName)
    console.log(nama[x].age)
    console.log('\n')

}
var buah =['apel', 'nangka','pear']
for(var x of buah){
    console.log('ini buah '+x)
}
