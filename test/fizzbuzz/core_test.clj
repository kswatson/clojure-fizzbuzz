(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest not-fizz-or-buzz
	(testing "Not multiple of 3 or 5 returns number."
		(is (= (fizzbuzz 2) 2))
		(is (= (fizzbuzz 4) 4))))
		
(deftest fizz-3
	(testing "Multiple of 3 returns fizz"
		(is (= (fizzbuzz 3) "fizz"))
		(is (= (fizzbuzz 9) "fizz")))) 
		
(deftest buzz-5
	(testing "Multiple of 5 returns buzz"
		(is (= (fizzbuzz 5) "buzz"))
		(is (= (fizzbuzz 10) "buzz"))))
		
(deftest fizzbuzz-15
	(testing "Multiple of 3 and 5 returns fizzbuzz"
		(is (= (fizzbuzz 15) "fizzbuzz"))
		(is (= (fizzbuzz 30) "fizzbuzz"))))