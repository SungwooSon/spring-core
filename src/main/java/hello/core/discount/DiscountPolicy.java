package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    /**
     * @return discounted price
     */
    int discount(Member member, int orderPrice);

}
