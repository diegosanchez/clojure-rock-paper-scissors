(ns kata.rock-paper-scissors-test
  (:require [clojure.test :refer :all]
            [kata.rock-paper-scissors :refer :all]))

(deftest scissors-test
  (testing "Winner"
    (is (= :scissors (winner :scissors :paper)))
    (is (= :scissors (winner :paper :scissors)))))

(deftest rock-test
  (testing "Winner"
    (is (= :rock (winner :rock :scissors)))
    (is (= :rock (winner :scissors :rock)))))

