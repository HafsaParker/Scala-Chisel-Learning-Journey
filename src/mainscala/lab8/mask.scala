package lab8task
import chisel3._
import chisel3.util._
class MaskedReadWriteSmem extends Module{
val width : Int = 8
val io = IO(new Bundle {
val enable = Input(Bool())
val write = Input( Bool())
val addr = Input(UInt(10.W ) )
val mask = Input(Vec(4, Bool()))
//val mask = Input(Vec(4, UInt(width.W)))
val dataIn = Input(Vec(4,UInt(width.W)))
val dataOut = Output(Vec(4,UInt(width.W)))
} )
// C r e a t e a 3 2 - b i t w i d e m e m o r y t h a t i s b y t e - m a s k e d
val mem = SyncReadMem(1024,Vec(4,UInt(width.W)))
// W r i t e w i t h m a s k
//mem.write(io.addr,io.dataIn,io.mask)
val vector = Reg(Vec(4,UInt()))
when(io.write){
    vector(0):= io.mask(0) & io.dataIn(0) // 0
    vector(1) := io.mask(1) & io.dataIn(1)//0
    vector(2):= io.mask(2) & io.dataIn(2)//1
    vector(3) := io.mask(3) & io.dataIn(3)//0
    mem.write(io.addr,vector)


}
io.dataOut:= mem.read(io.addr , io.enable)
}