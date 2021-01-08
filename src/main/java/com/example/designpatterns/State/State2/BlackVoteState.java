package com.example.designpatterns.State.State2;

/**
 * 黑名单状态
 */
public class BlackVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 记录在黑名单中，禁止登录系统
        System.out.println("提示：您已进入投票黑名单，禁止登录和使用本系统！");
    }

}
