import { sum } from ".";

describe("sum",()=>{
    it('sum of two values',()=>{
        expect(sum(10,20)).toBe(30);
    })
})