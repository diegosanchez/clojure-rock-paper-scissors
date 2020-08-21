(ns kata.rock-paper-scissors
  (:gen-class))

(defn winner [e1 e2]
  (cond
    (or (and (= e1 :scissors) (= e2 :paper)) (and (= e1 :paper) (= e2 :scissors))) :scissors
    (or (and (= e1 :rock) (= e2 :scissors)) (and (= e1 :scissors) (= e2 :rock))) :rock))
