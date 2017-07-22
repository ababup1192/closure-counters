use "collections"

actor Main
    new create(env:Env) =>
        let createCounter = {(): {ref(): U32} =>
            var count = U32(0)

            // refキーワードを利用することで、countの値を書き換えることが可能になる。
            {ref()(count): U32 =>
                count = count + 1
                count
            }
        }

        let counter = createCounter()

        for i in Range[U32](0, 10) do
            env.out.print(counter().string())
        end
