package lab2task
import chisel3._


class example extends Module{
    val io = IO (new Bundle{
        val x = Input(UInt(5.W))
        val y = Input(UInt(6.W))
        val out = Output(UInt())
    })
io.out := io.x +& io.y    

}
