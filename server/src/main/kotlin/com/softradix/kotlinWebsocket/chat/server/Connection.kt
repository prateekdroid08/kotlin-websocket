package com.softradix.kotlinWebsocket.chat.server

import io.ktor.http.cio.websocket.*
import java.util.concurrent.atomic.*

class Connection(val session: DefaultWebSocketSession) {
    companion object {
        var lastId = AtomicInteger(1)
    }
    val name = "user${lastId.getAndIncrement()}"
}
