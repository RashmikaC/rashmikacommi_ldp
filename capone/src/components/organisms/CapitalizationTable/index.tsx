import { Box } from "@mui/material";
import React from "react";
import { Typography } from "../../atoms/Typography";
import {
  CAPITALIZATION_HEADERS,
  CAPITALIZATION_ROWDATA,
} from "../../utils/constants";
import CapitalizationRow from "../../molecules/CapitalizationRow";

const CapitalizationTable = () => {
  return (
    <div>
      <Box paddingLeft={5} paddingRight={5}>
        <Box borderBottom={`1px solid #EBEEF1`} />

        <Box display={"flex"} justifyContent={"flex-end"} gap={2.5} paddingTop={'2px'} paddingBottom={'2px'}>
          {CAPITALIZATION_HEADERS.map((header) => (
            <Typography variant="C2" padding={"8px 8px 8px 20px"} key={header}>
              {header}
            </Typography>
          ))}
        </Box>
        <Box borderBottom={`1px solid #EBEEF1`} />

        {CAPITALIZATION_ROWDATA.map((row) => (
          <>
            <CapitalizationRow
              key={row.id}
              color={row.color}
              title={row.title}
              col1={row.col1}
              col2={row.col2}
              col3={row.col3}
              outstanding={row.outstanding}
              ownership1={row.ownership1}
              fullyDiluted={row.fullyDiluted}
              ownership2={row.ownership2}
            ></CapitalizationRow>
            <Box borderBottom={`1px solid #EBEEF1`} />
          </>
        ))}
      </Box>
    </div>
  );
};

export default CapitalizationTable;
