package lab5task
import chisel3._
import chisel3.util._
class datapacket [T<:Data](gen:T) extends Bundle{

        val afeild = (gen)
        val dfeild = (UInt(10.W))
}

class Router[ T <: Data](gen:T) extends Module {
        val io =IO(new Bundle{

        val inn = Input(new datapacket(gen))
        val out = Output(new datapacket(gen))
        

        })
        io.out.afeild := io.inn.afeild
        io.out.dfeild := io.inn.dfeild
        //io.out<>io.in
    
        
        
        

}