# Slow CLJS build with nested multimethod calls

When there are many nested multimethod calls, build time is increased
significantly. Only multimethods seem to trigger this behavior. If I
use regular function compilation is fast.

    | Multimethods Count | Build Time (in seconds) |
    |     0 (empty file) |                      17 |
    |                  5 |                      17 |
    |                 10 |                      18 |
    |                 15 |                      23 |
    |                 20 |                     130 |
    |                 21 |                     265 |


## This is slow

    (-> some-value
        (my-multimethod)
        (my-multimethod)
        ;; ... 20+ calls like this)

## This is fast

    (-> some-value
        (my-fn)
        (my-fn)
        ;; ... 20+ calls like this)
