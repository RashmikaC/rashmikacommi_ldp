import React from "react";
import Checkbox from "../../atoms/Checkbox";
import { tableHeaders } from "../../utils/constants";
import { Box } from "@mui/material";
import { Typography } from "../../atoms/Typography";

const TableHeader = () => {
  return (
    <div>
      <Box
        display={"flex"}
        justifyContent="space-between"
        alignItems="baseline"
      >
        <Box paddingTop={1.5} paddingBottom={1.5}>
          <Checkbox />
        </Box>

        {tableHeaders.map((column) => (
          <Box
            paddingRight={2.5}
            paddingTop={1.5}
            paddingBottom={1.5}
            width={"170px"}
            key={column}
          >
            <Typography
              variant="C2"
            >
              {column}
            </Typography>
          </Box>
        ))}
        <Box width={"170px"} />
      </Box>
    </div>
  );
};

export default TableHeader;
