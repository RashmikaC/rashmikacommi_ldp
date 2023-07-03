import { rest } from "msw";
import data from "../data/db.json";
export const handlers = [
  rest.get("http://localhost:3001/stakeholders", (req, res, ctx) => {
    return res(ctx.status(200), ctx.json(data.stakeholders));
  }),

  rest.post("http://localhost:3001/stakeholders", (req, res, ctx) => {
    return res(ctx.status(200));
  }),
  rest.patch("http://localhost:3001/stakeholders/1", (req, res, ctx) => {
    return res(ctx.status(200));
  }),
];