package com.example.designpatterns.State.State2;

/**
 * 重复投票状态
 */
public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 重复投票，此处仅打印一个警告作为示意
        System.out.println("警告：请不要重复投票!");
    }
}
