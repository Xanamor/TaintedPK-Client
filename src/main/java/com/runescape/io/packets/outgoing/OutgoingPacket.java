package com.runescape.io.packets.outgoing;

import com.runescape.io.ByteBuffer;

public interface OutgoingPacket {

	void buildPacket(ByteBuffer buf);
	
}
