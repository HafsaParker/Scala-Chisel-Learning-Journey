// package lab6task
// import chisel3._
// import chisel3.util._
// class ex4 extends Module{
//     val io = IO(new Bundle{
//         val in = Flipped(Decoupled( UInt (8.W)))
//         val out = Decoupled(UInt(8.W))
//     })
//     val queue1 = Queue(io.in,5)
//     val queue2 = Queue(queue1,5)
//     io.out.valid := true.B
//     io.in.ready := true.B
    


// }