// package lab8task
// import chisel3._
// import chisel3.util._

// class memory_asignment extends Module {
// val io = IO (new Bundle {
// val memory_out = Vec(4,Output(UInt(32.W)))
// val requestor = Vec(4,Flipped(Decoupled(UInt(32.W)))) //consumer 
// val Readaddr = Input(UInt(5.W))
// val Writeaddr = Input(UInt(5.W))
// })
// val memory = SyncReadMem(1024,Vec(4 ,UInt(32.W )))
// val arb = Module(new Arbiter(UInt(),4))
// val register  = Reg(Vec(4,UInt()))


// arb.io.in(0)<>Queue(io.requestor(0),4)
// arb.io.in(1)<>Queue(io.requestor(1),4)
// arb.io.in(2)<>Queue(io.requestor(2),4)
// arb.io.in(3)<>Queue(io.requestor(3),4)
// arb.io.out.ready:=1.B
// when(io.requestor(0)){//.valid
//     register(0):=arb.io.out.bits
//     memory.write(io.Writeaddr,register(0))

// }.elsewhen(io.requestor(1)){
//     register(1):=arb.io.out.bits
//     memory.write(io.Writeaddr,register(1))

// }.elsewhen(io.requestor(2)){
//     register(2):=arb.io.out.bits
//     memory.write(io.Writeaddr,register(2))


// }.otherwise{
//     register(3):=arb.io.out.bits
//     memory.write(io.Writeaddr,register(3))

// }
// io.memory_out:=memory.read(Readaddr)




// }
