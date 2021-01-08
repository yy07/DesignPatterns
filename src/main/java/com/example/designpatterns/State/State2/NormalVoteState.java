package com.example.designpatterns.State.State2;

/**
 * 正常投票状态
 */
public class NormalVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 正常投票，记录到投票记录中
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜您，投票成功。");
    }

}
