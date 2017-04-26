package com.huirong.netty.timeserverexcepyion;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import org.apache.log4j.Logger;

/**
 * Created by huirong on 17-4-10.
 */
public class TimeClientHandler extends ChannelHandlerAdapter {
    private static final Logger LOGGER =
            Logger.getLogger(TimeClientHandler.class.getName());
    private byte[] request;
    private int counter;

    public TimeClientHandler() {
        request = ("QUERY TIME ORDER" +
                System.getProperty("line.separator")).getBytes();

    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)
            throws Exception {
        ByteBuf buf = (ByteBuf) msg;
        byte[] request = new byte[buf.readableBytes()];
        buf.readBytes(request);
        String body = new String(request, "UTF-8");
        System.out.println("Now is : " + body +
                " ; counter is : " + ++counter);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ByteBuf message = null;
        for (int i = 0; i < 100; i++){
            message = Unpooled.buffer(request.length);
            message.writeBytes(request);
            ctx.writeAndFlush(message);
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
            throws Exception {
        LOGGER.warn("Unexpected exception from downstream : "
                + cause.getMessage());
        ctx.close();
    }
}