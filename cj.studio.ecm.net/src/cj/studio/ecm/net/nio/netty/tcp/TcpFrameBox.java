package cj.studio.ecm.net.nio.netty.tcp;

import cj.ultimate.util.NumberUtil;

public class TcpFrameBox {
	public static byte[]  box(byte[] b) {
		int len = b.length;
		byte[] res = new byte[len + 4];
		byte[] head = NumberUtil.intToByte4(len);
		System.arraycopy(head, 0, res, 0, 4);
		System.arraycopy(b, 0, res, 4, len);
		return res;
	}
}
