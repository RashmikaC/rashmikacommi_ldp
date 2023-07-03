import { Box } from "@mui/material";
import React from "react";
import { Typography } from "../Typography";
import theme from "../../../theme/theme";

interface TableCellProps {
  value: string;
}

export const TableCell = (props: TableCellProps) => {
  const { value } = props;
  return (
    <Box paddingLeft={2} paddingRight={2} width={"170px"} data-testid="table-cell">
      <Typography
        variant="B3"
        color={theme.palette.textColor.mediumEmphasis}

      >
        {value}
      </Typography>
    </Box>
  );
};
