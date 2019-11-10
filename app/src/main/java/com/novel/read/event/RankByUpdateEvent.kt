package com.novel.read.event

import com.mango.mangolib.event.BaseEvent
import com.novel.read.model.protocol.RankByUpdateResp

/**
 * create by 赵利君 on 2019/6/18
 * describe:
 */
class RankByUpdateEvent : BaseEvent<RankByUpdateResp> {

    constructor(result: RankByUpdateResp) : super(result) {}

    constructor() {}
}
