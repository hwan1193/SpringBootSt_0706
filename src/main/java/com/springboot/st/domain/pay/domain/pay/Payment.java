package com.springboot.st.domain.pay.domain.pay;

import com.springboot.st.domain.pay.domain.BaseTimeEntity;
import com.springboot.st.domain.pay.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
public class Payment extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User payUser;

    private String anotherUser;

    private String roomName;

    private String phoneNum;

    private String payContent;

    private String receiptId;

    private String methondName;

    private String payPrice;

    private String payTid;

    @Builder
    public Payment(User payUser, String roomName, String phoneNum, String payContent, String receiptId, String methondName, String payPrice, String payTid, String anotherUser) {
        this.payUser = payUser;
        this.roomName = roomName;
        this.phoneNum = phoneNum;
        this.payContent = payContent;
        this.anotherUser = anotherUser;
        this.receiptId = receiptId;
        this.methondName = methondName;
        this.payPrice = payPrice;
        this.payTid = payTid;
    }
}
