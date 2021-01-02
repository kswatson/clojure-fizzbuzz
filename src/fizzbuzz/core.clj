(ns fizzbuzz.core
  (:gen-class))

(defn fizzbuzz	[arg]
	(cond
		(and (= (mod arg 3) 0) (= (mod arg 5) 0)) "fizzbuzz"
		(= (mod arg 3) 0) "fizz"
		(= (mod arg 5) 0) "buzz"
		:else arg
	)	
)
	

(defn -main
  "Version of FizzBuzz Kata. For 1 to 'arg' will print the number, 'fizz', 'buzz', or 'fizzbuzz'. 
  If number is multiple of 3 will print 'fizz'. 
  If multiple of 5 will print 'buzz'. 
  If multiple of both will print 'fizzbuzz'. Otherwise will print the number.
  Negative numbers will print nothing."
  [arg]
  
  (dotimes [i (Integer/parseInt arg)]
	(println (fizzbuzz (+ 1 i))))
)