import { Box } from "@mui/material";
import React from "react";
import Checkbox from "../../atoms/Checkbox";
import { TableCell } from "../../atoms/TableCell";
import MoreHorizIcon from "@mui/icons-material/MoreHoriz";
import { RowData } from "../../utils/types";

interface RowProps {
  rowData: RowData;
  onEditClick: () => void;
}

const CheckBoxRow = (props: RowProps) => {
  const { rowData } = props;
  const columnConfig = [
    { value: rowData.stakeHolder },
    { value: rowData.portfolioEmail },
    { value: rowData.contactEmail },
    { value: rowData.relationship },
    { value: rowData.costCenter },
    { value: rowData.ownership },
  ];

  const handleEdit = () => {
    props.onEditClick();
  };

  return (
    <Box
      display={"flex"}
      gap={2}
      justifyContent="space-between"
      alignItems="baseline"
    >
      <Checkbox />

      {columnConfig.map((column, index) => (
        <TableCell key={column.value} value={column.value} />
      ))}

      <Box paddingLeft={2} paddingRight={2} width={"170px"}>
        <div onClick={handleEdit}>
          <MoreHorizIcon fontSize="small" />
        </div>
      </Box>
    </Box>
  );
};
export default CheckBoxRow;
