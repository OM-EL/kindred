package com.kindredgroup.unibetlivetest.entity;

import com.kindredgroup.unibetlivetest.types.BetState;
import com.kindredgroup.unibetlivetest.types.State;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "bet")
@Entity
@Data
public class Bet {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private int name;

    @Column(name = "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name="selection_id", nullable=false)
    private Selection selection;


    @Column(name = "state")
    @Enumerated(EnumType.STRING)
    State state;

    @Column(name = "stake")
    private BigDecimal stake;

    @Column(name = "bet_state")
    private BetState betState;

    @Column(name = "odd")
    BigDecimal betsOdds;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;


}
