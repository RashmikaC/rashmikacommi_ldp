import React, { useState } from "react";
import CheckBoxRow from "../../molecules/CheckBoxRow";
import { RowData } from "../../utils/types";
import { Backdrop, Box, Table, TableBody, TableContainer } from "@mui/material";
import TableHeader from "../../molecules/TableHeader";
import StakeholderDetailsCard from "../StakeholderDetailsCard";

interface TableData {
  tableData: RowData[];
}
const StakeHolderTable = (props: TableData) => {
  const { tableData } = props;
  const [editStakeholder, setEditStakeholder] = useState(false);
  const [id, setId]=useState<number>();
  const [name, setName]=useState('');
  const [email, setEmail]=useState('');
  const [relation, setRelation]=useState('');

  const handleEdit = (rowData: RowData) => {
    setEditStakeholder(true);
    setId(rowData.id);
    setName(rowData.stakeHolder);
    setEmail(rowData.contactEmail);
    setRelation(rowData.relationship);
  };

  return (
    <>
      <div style={{ paddingLeft: "40px", paddingRight: "40px" }}>
        <TableContainer>
          <Table>
            <Box borderBottom={`1px solid #EBEEF1`} />
            <TableHeader />
            <Box borderBottom={`1px solid #EBEEF1`} />
            <TableBody>
              {tableData.map((rowData) => (
                <>
                  <CheckBoxRow
                    key={rowData.id}
                    rowData={rowData}
                    onEditClick={() => handleEdit(rowData)}
                  />
                  <Box borderBottom={`1px solid #EBEEF1`} />
                </>
              ))}
            </TableBody>
          </Table>
        </TableContainer>
        {editStakeholder && (
          <Backdrop
            open={true}
            sx={{ zIndex: 1, backgroundColor: "#C0C8D2A6" }}
          >
            <Box position="absolute" top="9rem" left="33rem">
              <StakeholderDetailsCard
                onClose={() => setEditStakeholder(false)}
                update
                id={id}
                name={name}
                email={email}
                relation={relation}
              />
            </Box>
          </Backdrop>
        )}
      </div>
    </>
  );
};

export default StakeHolderTable;
