fun main(){
schoolname()
    println(student("James",15))
    println(length("mountain"))
    names("Joy")
    names("eunice")

}
fun schoolname(){
    var schoolname ="akirachix"
  var myschool=  "${schoolname[0]}${schoolname[2]}${schoolname[3]}"
    println(myschool)

}fun student(name:String ,age:Int):String{
    return "Hi, my $name and am $age years old"

}
fun length(name: String):Int{
return name.length
}
fun names(person:String){
    var name ="Joy"
    if (name==person){
        println("that is me") }
    else{
        println("i don't know who that is")}
}